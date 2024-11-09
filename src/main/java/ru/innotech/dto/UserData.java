package ru.innotech.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;
import ru.innotech.annotation.ColumnName;
import ru.innotech.annotation.TableName;

@AllArgsConstructor
@ToString
@TableName("users")
public class UserData {
    long id;
    @ColumnName("username")
    String user;

}
