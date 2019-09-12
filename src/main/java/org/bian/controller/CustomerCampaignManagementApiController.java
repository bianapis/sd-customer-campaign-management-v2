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
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class CustomerCampaignManagementApiController {

	@Autowired
	CustomerCampaignManagementApiService service;
	
	@Manage.Activate
	public BianResponse<SDCustomerCampaignManagementActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerCampaignManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDCustomerCampaignManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerCampaignManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Create
	public BianResponse<CRCustomerCampaignPortfolioManagementPlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerCampaignPortfolioManagementPlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("campaigndirection")
	@Manage.Create
	public BianResponse<BQCampaignDirectionCreateOutputModel> createCampaigndirection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCampaignDirectionCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createCampaigndirection(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceassessment")
	@Manage.Create
	public BianResponse<BQPerformanceAssessmentCreateOutputModel> createPerformanceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPerformanceAssessmentCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createPerformanceassessment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("markettracking")
	@Manage.Execute
	public BianResponse<BQMarketTrackingExecuteOutputModel> executeMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMarketTrackingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeMarkettracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceassessment")
	@Manage.Execute
	public BianResponse<BQPerformanceAssessmentExecuteOutputModel> executePerformanceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPerformanceAssessmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executePerformanceassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDCustomerCampaignManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerCampaignManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Grant
	public BianResponse<CRCustomerCampaignPortfolioManagementPlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignPortfolioManagementPlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("campaigndirection")
	@Manage.Request
	public BianResponse<BQCampaignDirectionRequestOutputModel> requestCampaigndirection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCampaignDirectionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCampaigndirection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("markettracking")
	@Manage.Request
	public BianResponse<BQMarketTrackingRequestOutputModel> requestMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMarketTrackingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMarkettracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceassessment")
	@Manage.Request
	public BianResponse<BQPerformanceAssessmentRequestOutputModel> requestPerformanceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPerformanceAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestPerformanceassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CRCustomerCampaignPortfolioManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignPortfolioManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Retrieve
	public BianResponse<CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("campaigndirection")
	@Manage.Retrieve
	public BianResponse<BQCampaignDirectionRetrieveOutputModel> retrieveCampaigndirection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCampaigndirection(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("markettracking")
	@Manage.Retrieve
	public BianResponse<BQMarketTrackingRetrieveOutputModel> retrieveMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMarkettracking(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("performanceassessment")
	@Manage.Retrieve
	public BianResponse<BQPerformanceAssessmentRetrieveOutputModel> retrievePerformanceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePerformanceassessment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDCustomerCampaignManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRCustomerCampaignPortfolioManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignPortfolioManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("campaigndirection")
	@Manage.Update
	public BianResponse<BQCampaignDirectionUpdateOutputModel> updateCampaigndirection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCampaignDirectionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCampaigndirection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("markettracking")
	@Manage.Update
	public BianResponse<BQMarketTrackingUpdateOutputModel> updateMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMarketTrackingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMarkettracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("performanceassessment")
	@Manage.Update
	public BianResponse<BQPerformanceAssessmentUpdateOutputModel> updatePerformanceassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPerformanceAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePerformanceassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
