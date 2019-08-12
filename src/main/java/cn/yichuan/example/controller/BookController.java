package cn.yichuan.example.controller;

import cn.yichuan.example.Infrastructure.goods.BookRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
//control+enter import class
public class BookController {


    @Autowired
    private BookRepository bookRepository;

    @ApiOperation("获取所有的Goods")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @PostMapping(path = "findAll")
    public void findAll() {
        bookRepository.findAll();
    }
}
