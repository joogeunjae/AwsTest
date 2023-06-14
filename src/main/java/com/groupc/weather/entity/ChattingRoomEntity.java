package com.groupc.weather.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.groupc.weather.entity.primaryKey.ChattingRoomPk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="chatting_room")
@Entity(name="chatting_room")
@IdClass(ChattingRoomPk.class)
public class ChattingRoomEntity {
    
    @Id
    private String roomId;
    @Id
    private Integer userNumber;
    
}
