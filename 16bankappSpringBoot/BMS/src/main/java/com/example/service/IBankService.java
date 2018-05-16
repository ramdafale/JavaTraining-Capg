/**
 * 
 */
package com.example.service;

import java.math.BigDecimal;
import java.util.Optional;

import com.example.model.Bank;

/**
 * @author trainee
 *
 */
interface IBankService {

	
	int addBank(Bank bank);
	
	Optional<Bank> getBankDetails(BigDecimal id);
	
	
	
}
