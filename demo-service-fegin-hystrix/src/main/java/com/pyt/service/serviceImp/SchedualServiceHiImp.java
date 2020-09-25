package com.pyt.service.serviceImp;

import com.pyt.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by admin on 2020/9/24.
 */
@Component
public class SchedualServiceHiImp  implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}
