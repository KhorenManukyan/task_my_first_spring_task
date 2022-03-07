package my_tasks.tasks.service.impl;

import my_tasks.tasks.dto.requestDto.UserRequestDto;
import my_tasks.tasks.dto.responseDto.UserResponseDto;
import my_tasks.tasks.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        return null;
    }
}
