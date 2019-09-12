/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCampaignManagementApiService {

	SDCustomerCampaignManagementActivateOutputModel activate(SDCustomerCampaignManagementActivateInputModel request);
	
	SDCustomerCampaignManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerCampaignManagementConfigureInputModel request);
	
	CRCustomerCampaignPortfolioManagementPlanCreateOutputModel create(String sdReferenceId, CRCustomerCampaignPortfolioManagementPlanCreateInputModel request);
	
	BQCampaignDirectionCreateOutputModel createCampaigndirection(String sdReferenceId, String crReferenceId, BQCampaignDirectionCreateInputModel request);
	
	BQPerformanceAssessmentCreateOutputModel createPerformanceassessment(String sdReferenceId, String crReferenceId, BQPerformanceAssessmentCreateInputModel request);
	
	BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request);
	
	BQPerformanceAssessmentExecuteOutputModel executePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentExecuteInputModel request);
	
	SDCustomerCampaignManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCampaignManagementFeedbackInputModel request);
	
	CRCustomerCampaignPortfolioManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerCampaignPortfolioManagementPlanGrantInputModel request);
	
	BQCampaignDirectionRequestOutputModel requestCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionRequestInputModel request);
	
	BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request);
	
	BQPerformanceAssessmentRequestOutputModel requestPerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentRequestInputModel request);
	
	CRCustomerCampaignPortfolioManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCampaignPortfolioManagementPlanRequestInputModel request);
	
	CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQCampaignDirectionRetrieveOutputModel retrieveCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPerformanceAssessmentRetrieveOutputModel retrievePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerCampaignManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerCampaignPortfolioManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCampaignPortfolioManagementPlanUpdateInputModel request);
	
	BQCampaignDirectionUpdateOutputModel updateCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionUpdateInputModel request);
	
	BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request);
	
	BQPerformanceAssessmentUpdateOutputModel updatePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentUpdateInputModel request);
	
}
