/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.contrl;

import edu.lms.project.dto.BookDTO;
import edu.lms.project.dto.BookdetailDTO;
import edu.lms.project.service.BookDetailService;
import edu.lms.project.service.BookService;
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
public class HomeController {
    
    @Autowired
    private BookService bookService;
    
    @Autowired
    private BookDetailService bookDetailService;
    
    @RequestMapping(value = "lmshome" , method = RequestMethod.GET)
    public String homePage(ModelMap map){        
        return "home";
    }
    
    @RequestMapping(value = "result" ,method = RequestMethod.GET)
    public String searchResult(ModelMap map){
        ArrayList<BookDTO> searchedBooks=bookService.getSearchedBooks();
        map.addAttribute("searchedBooks", searchedBooks);
        return "searchresult";
    }
    
    @RequestMapping(value = "booklist" ,method = RequestMethod.GET)
    public String booklist(ModelMap map){
       ArrayList<BookDTO> book = bookService.getBook();
        map.addAttribute("books" , book);
        return "booklist";
    }
    
    @RequestMapping(value = "transaction",method = RequestMethod.POST)
    public String transaction(@Valid BookdetailDTO bookdetailDTO ,ModelMap map){
        bookDetailService.addDetail(bookdetailDTO);
        return "home";
    }
    
    
}
