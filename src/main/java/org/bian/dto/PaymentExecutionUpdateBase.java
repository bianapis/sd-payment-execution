package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PaymentExecutionUpdateBase
 */
public class PaymentExecutionUpdateBase   {
  private String paymentTransactionUpdateReference = null;

  private String paymentTransactionUpdateDescription = null;

  private String paymentTransactionUpdateResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return paymentTransactionUpdateReference
  **/

  public String getPaymentTransactionUpdateReference() {
    return paymentTransactionUpdateReference;
  }

  public void setPaymentTransactionUpdateReference(String paymentTransactionUpdateReference) {
    this.paymentTransactionUpdateReference = paymentTransactionUpdateReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentTransactionUpdateDescription
  **/

  public String getPaymentTransactionUpdateDescription() {
    return paymentTransactionUpdateDescription;
  }

  public void setPaymentTransactionUpdateDescription(String paymentTransactionUpdateDescription) {
    this.paymentTransactionUpdateDescription = paymentTransactionUpdateDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return paymentTransactionUpdateResult
  **/

  public String getPaymentTransactionUpdateResult() {
    return paymentTransactionUpdateResult;
  }

  public void setPaymentTransactionUpdateResult(String paymentTransactionUpdateResult) {
    this.paymentTransactionUpdateResult = paymentTransactionUpdateResult;
  }


}

