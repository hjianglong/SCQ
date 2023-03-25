package com.rx.scq.mapper;

import com.rx.scq.entity.vo.DeskBasedatasVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskBasedatasMapper {

    /**
     * 根据机器码查询img
     * @param mac 机器码
     * @return
     */
    List<DeskBasedatasVO> img(String mac);

    /**
     * 根据机器码查询txtImg
     * @param mac 机器码
     * @return
     */
    List<DeskBasedatasVO> txtImg(String mac);

    /**
     * 根据机器码查询Limg
     * @param mac 机器码
     * @return
     */
    List<DeskBasedatasVO> Limg(String mac);

    /**
     * 根据机器码查询Rimg
     * @param mac 机器码
     * @return
     */
    List<DeskBasedatasVO> Rimg(String mac);

    /**
     * 根据mac删除数据
     * @param mac
     * @return
     */
    int delete(String mac);



}
