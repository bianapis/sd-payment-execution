package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PaymentExecutionTransaction
 */
public class PaymentExecutionTransaction   {
  private String paymenTransactionReference = null;

  private String paymentTransactionRequestReference = null;

  private String paymentExecutionTransaction = null;

  private String paymentOrderReference = null;

  private String payerAccountReference = null;

  private String payeeAccountReference = null;

  private String washAccountReference = null;

  private String intermediaryAccountReference = null;

  private String currency = null;

  private String dateType = null;

  private String date = null;

  private String paymentMechanism = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return paymenTransactionReference
  **/

  public String getPaymenTransactionReference() {
    return paymenTransactionReference;
  }

  public void setPaymenTransactionReference(String paymenTransactionReference) {
    this.paymenTransactionReference = paymenTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return paymentTransactionRequestReference
  **/

  public String getPaymentTransactionRequestReference() {
    return paymentTransactionRequestReference;
  }

  public void setPaymentTransactionRequestReference(String paymentTransactionRequestReference) {
    this.paymentTransactionRequestReference = paymentTransactionRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentExecutionTransaction
  **/

  public String getPaymentExecutionTransaction() {
    return paymentExecutionTransaction;
  }

  public void setPaymentExecutionTransaction(String paymentExecutionTransaction) {
    this.paymentExecutionTransaction = paymentExecutionTransaction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return paymentOrderReference
  **/

  public String getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(String paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return payerAccountReference
  **/

  public String getPayerAccountReference() {
    return payerAccountReference;
  }

  public void setPayerAccountReference(String payerAccountReference) {
    this.payerAccountReference = payerAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return payeeAccountReference
  **/

  public String getPayeeAccountReference() {
    return payeeAccountReference;
  }

  public void setPayeeAccountReference(String payeeAccountReference) {
    this.payeeAccountReference = payeeAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return washAccountReference
  **/

  public String getWashAccountReference() {
    return washAccountReference;
  }

  public void setWashAccountReference(String washAccountReference) {
    this.washAccountReference = washAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return intermediaryAccountReference
  **/

  public String getIntermediaryAccountReference() {
    return intermediaryAccountReference;
  }

  public void setIntermediaryAccountReference(String intermediaryAccountReference) {
    this.intermediaryAccountReference = intermediaryAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return dateType
  **/

  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name     
   * @return paymentMechanism
  **/

  public String getPaymentMechanism() {
    return paymentMechanism;
  }

  public void setPaymentMechanism(String paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
  }


}

