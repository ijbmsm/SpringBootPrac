package com.kosta.SpringBootPrac.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userNO;
    private String name;
    private int ssg;
}
