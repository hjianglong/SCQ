package com.rx.scq.controller;

import com.rx.scq.entity.vo.DeskBasedatasVO;
import com.rx.scq.mapper.DeskBasedatasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@Order(value = 1)
public class DeskBasedatasController implements ApplicationRunner {

    @Value("${fixedRate}")
    Long fixedRate;
    @Value("${mac}")
    String mac;
    @Value("${readPath}")
    String readPath;

    @Autowired
    DeskBasedatasMapper deskBasedatasMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true) {
            try {
                String substring = mac.substring(0, mac.length());
                String[] result = substring.split(",");
                for (String r : result) {
                    System.out.println(r);
                    scq(r);
                }
                System.out.println("开始执行程序..........");

            System.out.println("暂无可执行文件，程序暂停"+fixedRate+"分钟再执行。。。");
                TimeUnit.MINUTES.sleep(fixedRate);//分
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void scq(String mac){
        try{
            String substring = mac.substring(0,mac.length());
            substring.split(",");
            List<DeskBasedatasVO> img = deskBasedatasMapper.img(mac);
            List<DeskBasedatasVO> txtImg = deskBasedatasMapper.txtImg(mac);
            List<DeskBasedatasVO> Limg = deskBasedatasMapper.Limg(mac);
            List<DeskBasedatasVO> Rimg = deskBasedatasMapper.Rimg(mac);
            for (Object img1 : img){
                Path path = Paths.get(readPath+img1);
                boolean delete = Files.deleteIfExists(path);
                if(delete == false){
                    System.out.println(delete+"路径"+path+"不存在");
                }else {
                    System.out.println("路径"+path+"删除成功");
                }
                deskBasedatasMapper.delete(mac);
            }
            for (Object txtImg1 : txtImg){
                Path path = Paths.get(readPath+txtImg1);
                boolean delete = Files.deleteIfExists(path);
                if(delete == false){
                    System.out.println(delete+"路径"+path+"不存在");
                }else {
                    System.out.println("路径"+path+"删除成功");
                }
                deskBasedatasMapper.delete(mac);
            }
            for (Object Limg1 : Limg){
                Path path = Paths.get(readPath+Limg1);
                boolean delete = Files.deleteIfExists(path);
                if(delete == false){
                    System.out.println(delete+"路径"+path+"不存在");
                }else {
                    System.out.println("路径"+path+"删除成功");
                }
                deskBasedatasMapper.delete(mac);
            }
            for (Object Rimg1 : Rimg) {
                Path path = Paths.get(readPath + Rimg1);
                boolean delete = Files.deleteIfExists(path);
                if(delete == false){
                    System.out.println(delete+"路径"+path+"不存在");
                }else {
                    System.out.println("路径"+path+"删除成功");
                }
                deskBasedatasMapper.delete(mac);
            }
            deskBasedatasMapper.delete(mac);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
