package com.programmer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
    @Id
    private Integer bid;

    private String bookname;

    private String author;

    private String publisher;

    private Float price;

    private Integer cid;

    private static final long serialVersionUID = 1L;
    @Transient
    private String catename;


}