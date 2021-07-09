package com.lee.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Package: com.lee.api.pojo
 * Description： TODO
 * Author: CareLee
 * Date: Created in 7/8/2021 6:30 PM
 * Copyright: Copyright (c) 2040. All rights reserved.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private long id;
    private String serial;

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
