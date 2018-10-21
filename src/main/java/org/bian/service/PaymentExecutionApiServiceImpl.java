/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PaymentExecutionApiServiceImpl implements PaymentExecutionApiService {

	public PaymentExecutionCaptureBaseWithId executePost(PaymentExecutionUpdateBase request){
		return JsonReader.read("executePost-PaymentExecutionCaptureBaseWithId.json",new TypeReference<PaymentExecutionCaptureBaseWithId>(){});
	}
	
	public PaymentExecutionCaptureBaseWithId executePut(String crReferenceId, PaymentExecutionUpdateBase request){
		return JsonReader.read("executePut-PaymentExecutionCaptureBaseWithId.json",new TypeReference<PaymentExecutionCaptureBaseWithId>(){});
	}
	
	public PaymentExecutionRecordResponse record(String crReferenceId, PaymentExecutionRecordRequest request){
		return JsonReader.read("record-PaymentExecutionRecordResponse.json",new TypeReference<PaymentExecutionRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PaymentExecutionCaptureBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-PaymentExecutionCaptureBaseWithId.json",new TypeReference<PaymentExecutionCaptureBaseWithId>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public PaymentExecutionMechanism retrieveMechanisms(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentExecutionMechanism.json",new TypeReference<PaymentExecutionMechanism>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PaymentExecutionTransaction retrieveTransactions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentExecutionTransaction.json",new TypeReference<PaymentExecutionTransaction>(){});
	}
	
	public PaymentExecutionUpdateResponse retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentExecutionUpdateResponse.json",new TypeReference<PaymentExecutionUpdateResponse>(){});
	}
	
	public PaymentExecutionReportingsResponse retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentExecutionReportingsResponse.json",new TypeReference<PaymentExecutionReportingsResponse>(){});
	}
	
	public PaymentExecutionUpdateResponse update(String crReferenceId, PaymentExecutionUpdateRequest request){
		return JsonReader.read("update-PaymentExecutionUpdateResponse.json",new TypeReference<PaymentExecutionUpdateResponse>(){});
	}
	
}
