/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class PaymentExecutionApiController {

	@Autowired
	PaymentExecutionApiService service;
	
	@Process.ExecutePost
	public BianResponse<PaymentExecutionCaptureBaseWithId> executePost(@RequestBody BianRequest<PaymentExecutionUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<PaymentExecutionCaptureBaseWithId> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentExecutionUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<PaymentExecutionRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentExecutionRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.Retrieve
	public BianResponse<PaymentExecutionCaptureBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("mechanisms")
	@Process.Retrieve
	public BianResponse<PaymentExecutionMechanism> retrieveMechanisms(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMechanisms(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("transactions")
	@Process.Retrieve
	public BianResponse<PaymentExecutionTransaction> retrieveTransactions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactions(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Process.Retrieve
	public BianResponse<PaymentExecutionUpdateResponse> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<PaymentExecutionReportingsResponse> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<PaymentExecutionUpdateResponse> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentExecutionUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
