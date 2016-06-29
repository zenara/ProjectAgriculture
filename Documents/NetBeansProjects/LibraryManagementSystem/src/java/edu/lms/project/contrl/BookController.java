/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.contrl;

import edu.lms.project.dto.BookDTO;
import edu.lms.project.dto.CategoryDTO;
import edu.lms.project.service.BookService;
import edu.lms.project.service.CategoryService;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Chathurika Senani
 */
@Controller
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String manageBook(ModelMap map) {
        BookDTO bookDTO = new BookDTO();

        ArrayList<CategoryDTO> categories = categoryService.getCategories();
        map.addAttribute("categories", categories);
        
        ArrayList<BookDTO> book = bookService.getBook();
        map.addAttribute("books" , book);
        
        map.addAttribute("loadbook", bookDTO);
        return "managebooks";
    }

    @RequestMapping(value = "/addbook", method = RequestMethod.POST)
    public String addBook(@Valid BookDTO bookDTO, ModelMap map) {
        
        BookDTO bookLastId=bookService.getBookLastId();
        String bookId=bookLastId.getBookId();
        
        int lastId=Integer.parseInt(bookId);
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(false);
        numberFormat.setMinimumIntegerDigits(3);
        
        bookDTO.setBookId(numberFormat.format(lastId+1));
        
        bookService.addBook(bookDTO);
        System.out.println("DONE");
        return "home";
    }

}
