package my_tasks.tasks.service;

import my_tasks.tasks.dto.requestDto.UserRequestDto;
import my_tasks.tasks.dto.responseDto.UserResponseDto;

public interface UserService {

       UserResponseDto save(UserRequestDto userRequestDto);
}
