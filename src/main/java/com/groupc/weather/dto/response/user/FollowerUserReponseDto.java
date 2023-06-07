package com.groupc.weather.dto.response.user;

import java.util.List;

import com.groupc.weather.dto.ResponseDto;
import com.groupc.weather.entity.resultSet.GetFollowerListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class FollowerUserReponseDto extends ResponseDto{

    private List<FollowerList> followerUserList;
    private int count;
    
    public FollowerUserReponseDto(List<FollowerList> followerResultList){
        
        super("SU", "Success"); 
        
        this.followerUserList = followerResultList;
        this.count = 0;
    } 

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class FollowerList {
    private Integer userNumber;
    private String nickname;
    private String profileImageUrl;

    public FollowerList(GetFollowerListResultSet getFollowerListResultSet) {
        this.userNumber = getFollowerListResultSet.getUserNumber();
        this.nickname = getFollowerListResultSet.getUserNickname();
        this.profileImageUrl = getFollowerListResultSet.getUserProfileImageUrl();
        
        }
    }
}
