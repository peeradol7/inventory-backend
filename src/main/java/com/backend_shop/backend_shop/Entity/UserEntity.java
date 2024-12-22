package com.backend_shop.backend_shop.Entity;

import java.sql.Blob;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class UserEntity {

 private long user_id;
 private String username;
 private String password;
 private String phone_number;
 @JsonFormat(pattern = "YYYY:MM:DD HH:MM:SS")
 private Date create_date;

}