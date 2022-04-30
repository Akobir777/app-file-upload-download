package uz.ppd.appfileuploaddownload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fileOriginalName;//pdp.jpg, inn.pdf

    private long size;//2048000

    private String contentType;//application/pdp  image/png

    //Bu file sytemaga saqlaganda kerak bo'lasdi
    private String name;//Papkani ichidan topish uchun
}
