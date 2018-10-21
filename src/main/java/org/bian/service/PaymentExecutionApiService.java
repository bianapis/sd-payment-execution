/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PaymentExecutionApiService {

	PaymentExecutionCaptureBaseWithId executePost(PaymentExecutionUpdateBase request);
	
	PaymentExecutionCaptureBaseWithId executePut(String crReferenceId, PaymentExecutionUpdateBase request);
	
	PaymentExecutionRecordResponse record(String crReferenceId, PaymentExecutionRecordRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	PaymentExecutionCaptureBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	PaymentExecutionMechanism retrieveMechanisms(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	PaymentExecutionTransaction retrieveTransactions(String crReferenceId, String bqReferenceId);
	
	PaymentExecutionUpdateResponse retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	PaymentExecutionReportingsResponse retrieveReportings(String crReferenceId, String bqReferenceId);
	
	PaymentExecutionUpdateResponse update(String crReferenceId, PaymentExecutionUpdateRequest request);
	
}
