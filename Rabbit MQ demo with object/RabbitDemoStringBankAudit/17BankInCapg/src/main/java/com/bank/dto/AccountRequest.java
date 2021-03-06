package com.bank.dto;

import com.bank.model.Account;

public class AccountRequest {

	private long bankId;
	private long customerId;
	 private Account account;
	/**
	 * @return the bankId
	 */
	public long getBankId() {
		return bankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountRequest [bankId=" + bankId + ", customerId=" + customerId + ", account=" + account + "]";
	}
	
	
	
}
