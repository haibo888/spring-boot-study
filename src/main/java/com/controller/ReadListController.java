/*
package com.controller;

import com.domain.Book;
import com.mapper.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

*/
/**
 * @author Haibo
 * @date 2020-03-28 00:32
 *//*

@Controller
@RequestMapping("/readingList")
public class ReadListController {


    @Autowired
     private ReadingListRepository readingListRepository;

    public ReadListController (ReadingListRepository readingListRepository){
      this.readingListRepository =  readingListRepository;
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model){

        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList!=null){
            model.addAttribute("books",readingList);
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.POST)
        public String addToReadingList(@PathVariable("reader") String reader, Book book){
        System.out.println("进入增加图书列表");
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/readingList/{reader}";
    }

}
*/
