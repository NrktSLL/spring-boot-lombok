package com.nrktsll.springbootlombok.model.Impl;

import com.nrktsll.springbootlombok.service.StaffService;
import com.nrktsll.springbootlombok.model.Staff;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor(staticName = "getInstance")
@Service
public class StaffImpl implements StaffService {

    @Override
    public void addStaff(Staff staff) {
        System.out.println(staff);
    }
}
