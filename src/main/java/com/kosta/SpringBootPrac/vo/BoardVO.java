package com.kosta.SpringBootPrac.vo;

import ch.qos.logback.core.boolex.EvaluationException;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_boards")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bno;

    @NonNull
    @Column(nullable = false)
    private String title;

    @Column
    private String content;

    @Column
    private String writer;

    @CreationTimestamp
    private Timestamp regDate;

    @UpdateTimestamp
    private Timestamp updateDate;


}
