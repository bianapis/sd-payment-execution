package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PaymentExecutionMechanism
 */
public class PaymentExecutionMechanism   {
  private String paymentTransactionMechanismReference = null;

  private String paymentTransactionRequestReference = null;

  private String paymentExecutionTransaction = null;

  private String achAccessServiceSessionReference = null;

  private String achAccessSchedule = null;

  private String correspondentServiceSessionReference = null;

  private String correspondentServiceAccessSchedule = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return paymentTransactionMechanismReference
  **/

  public String getPaymentTransactionMechanismReference() {
    return paymentTransactionMechanismReference;
  }

  public void setPaymentTransactionMechanismReference(String paymentTransactionMechanismReference) {
    this.paymentTransactionMechanismReference = paymentTransactionMechanismReference;
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
   * @return achAccessServiceSessionReference
  **/

  public String getAchAccessServiceSessionReference() {
    return achAccessServiceSessionReference;
  }

  public void setAchAccessServiceSessionReference(String achAccessServiceSessionReference) {
    this.achAccessServiceSessionReference = achAccessServiceSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration     
   * @return achAccessSchedule
  **/

  public String getAchAccessSchedule() {
    return achAccessSchedule;
  }

  public void setAchAccessSchedule(String achAccessSchedule) {
    this.achAccessSchedule = achAccessSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return correspondentServiceSessionReference
  **/

  public String getCorrespondentServiceSessionReference() {
    return correspondentServiceSessionReference;
  }

  public void setCorrespondentServiceSessionReference(String correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration      
   * @return correspondentServiceAccessSchedule
  **/

  public String getCorrespondentServiceAccessSchedule() {
    return correspondentServiceAccessSchedule;
  }

  public void setCorrespondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
  }


}

