package dev.azemoning.HelloSpring.model.dto;

import lombok.Data;

@Data
public class CreateAsetDto {
    private String nama;
    private Integer umur_aset;
    private Integer jumlah_aset;
}
