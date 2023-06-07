package com.groupc.weather.dto.response.user;

import com.groupc.weather.dto.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserResponseDto extends ResponseDto {
    private String token;
    private int expirationDate;

    public LoginUserResponseDto(String token) {
        super("SU", "Success");
        this.token = token;
        this.expirationDate = 3600; // 토큰 유효한 시간 보여주는 용도 실제로 시간 설정하는건 jwt프로바이더에서 설정
    }
}
