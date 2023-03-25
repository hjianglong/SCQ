package com.rx.scq.mapper;

import com.rx.scq.entity.vo.DeskBasedatasVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DeskBasedatasMapperTexts {

    @Autowired
    DeskBasedatasMapper deskBasedatasMapper;

    @Test
    void img(){
        List<DeskBasedatasVO> list = deskBasedatasMapper.img("0599");
        System.out.println("查询列表完成，列表中的数据的数量:"+ list.size());
        for (Object item : list) {
            System.out.println(item);
        }
    }

    @Test
    void txtImg(){
        List<DeskBasedatasVO> list = deskBasedatasMapper.txtImg("0599");
        System.out.println("查询列表完成，列表中的数据的数量:"+ list.size());
        for (Object item : list) {
            System.out.println(item);
        }
    }

    @Test
    void Limg(){
        List<DeskBasedatasVO> list = deskBasedatasMapper.Limg("0599");
        System.out.println("查询列表完成，列表中的数据的数量:"+ list.size());
        for (Object item : list) {
            System.out.println(item);
        }
    }

    @Test
    void Rimg(){
        List<DeskBasedatasVO> list = deskBasedatasMapper.Rimg("0599");
        System.out.println("查询列表完成，列表中的数据的数量:"+ list.size());
        for (Object item : list) {
            System.out.println(item);
        }
    }

}
