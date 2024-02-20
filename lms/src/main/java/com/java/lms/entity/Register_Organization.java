package com.java.lms.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "register_organization")
public class Register_Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Primary key for register_programme table and enroll_course table
    private int organization_id;

    @NotBlank(message = " Organization Name cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " Organization Name has invalid characters")
    private String organization_name;

    @Email
    @NotBlank
    private String email_id;

    private Date registered_date;

    @NotBlank(message = " Discription cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " Discription has invalid characters")
    private String discription;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "Password must contain at least one digit, one lowercase, one uppercase, and one special character")
    private String password;

    @NotBlank(message = "Address cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " Address has invalid characters")
    private String Address;

    @NotBlank(message = "city cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " City has invalid characters")
    private String city;

    @NotBlank(message = "State cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " State has invalid characters")
    private String state;
    @NotBlank(message = "Country cannot be empty")
    @Pattern(regexp = "^[A-Za-z]*[A-Za-z-'. ]*[A-Za-z]*$", message = " Country has invalid characters")
    private String country;

    @NotBlank
    @Size(min = 10, max = 10)
    private String contact_no;

    @Override
    public String toString() {
        return "Register_Organization [organization_id=" + organization_id + ", organization_name=" + organization_name
                + ", email_id=" + email_id + ", registered_date=" + registered_date + ", discription=" + discription
                + ", password=" + password + ", Address=" + Address + ", city=" + city + ", state=" + state
                + ", country=" + country + ", contact_no=" + contact_no + "]";
    }

}
