package com.xworkz.president;

import com.xworkz.president.dto.PresidentDto;

@FunctionalInterface
public interface SearchPresident {

	boolean search(PresidentDto temp, String a2);
}
