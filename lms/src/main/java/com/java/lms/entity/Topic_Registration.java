package com.java.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "topic_registration")

public class Topic_Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Primary key for topic_registration table
    private int sequence_no;

    // @ManyToOne
    private int topic_creator_id;

    // @OneToMany
    private int topic_id;

    @NotBlank(message = " Topic Name cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " Topic Name has invalid characters")
    private String topic_name;

    @NotBlank(message = " Descrpition cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " Descrpition has invalid characters")
    private String topic_descrpition;

    private String video_file;

    private String transcript_file;

    private String pdf_file;

}
