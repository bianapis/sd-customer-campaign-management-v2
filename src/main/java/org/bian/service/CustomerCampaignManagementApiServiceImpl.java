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
public class CustomerCampaignManagementApiServiceImpl implements CustomerCampaignManagementApiService {

	public SDCustomerCampaignManagementActivateOutputModel activate(SDCustomerCampaignManagementActivateInputModel request){
		return JsonReader.read("activate-SDCustomerCampaignManagementActivateOutputModel.json",new TypeReference<SDCustomerCampaignManagementActivateOutputModel>(){});
	}
	
	public SDCustomerCampaignManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerCampaignManagementConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerCampaignManagementConfigureOutputModel.json",new TypeReference<SDCustomerCampaignManagementConfigureOutputModel>(){});
	}
	
	public CRCustomerCampaignPortfolioManagementPlanCreateOutputModel create(String sdReferenceId, CRCustomerCampaignPortfolioManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRCustomerCampaignPortfolioManagementPlanCreateOutputModel.json",new TypeReference<CRCustomerCampaignPortfolioManagementPlanCreateOutputModel>(){});
	}
	
	public BQCampaignDirectionCreateOutputModel createCampaigndirection(String sdReferenceId, String crReferenceId, BQCampaignDirectionCreateInputModel request){
		return JsonReader.read("create-BQCampaignDirectionCreateOutputModel.json",new TypeReference<BQCampaignDirectionCreateOutputModel>(){});
	}
	
	public BQPerformanceAssessmentCreateOutputModel createPerformanceassessment(String sdReferenceId, String crReferenceId, BQPerformanceAssessmentCreateInputModel request){
		return JsonReader.read("create-BQPerformanceAssessmentCreateOutputModel.json",new TypeReference<BQPerformanceAssessmentCreateOutputModel>(){});
	}
	
	public BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request){
		return JsonReader.read("execute-BQMarketTrackingExecuteOutputModel.json",new TypeReference<BQMarketTrackingExecuteOutputModel>(){});
	}
	
	public BQPerformanceAssessmentExecuteOutputModel executePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentExecuteInputModel request){
		return JsonReader.read("execute-BQPerformanceAssessmentExecuteOutputModel.json",new TypeReference<BQPerformanceAssessmentExecuteOutputModel>(){});
	}
	
	public SDCustomerCampaignManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCampaignManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerCampaignManagementFeedbackOutputModel.json",new TypeReference<SDCustomerCampaignManagementFeedbackOutputModel>(){});
	}
	
	public CRCustomerCampaignPortfolioManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerCampaignPortfolioManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRCustomerCampaignPortfolioManagementPlanGrantOutputModel.json",new TypeReference<CRCustomerCampaignPortfolioManagementPlanGrantOutputModel>(){});
	}
	
	public BQCampaignDirectionRequestOutputModel requestCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionRequestInputModel request){
		return JsonReader.read("request-BQCampaignDirectionRequestOutputModel.json",new TypeReference<BQCampaignDirectionRequestOutputModel>(){});
	}
	
	public BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request){
		return JsonReader.read("request-BQMarketTrackingRequestOutputModel.json",new TypeReference<BQMarketTrackingRequestOutputModel>(){});
	}
	
	public BQPerformanceAssessmentRequestOutputModel requestPerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentRequestInputModel request){
		return JsonReader.read("request-BQPerformanceAssessmentRequestOutputModel.json",new TypeReference<BQPerformanceAssessmentRequestOutputModel>(){});
	}
	
	public CRCustomerCampaignPortfolioManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCampaignPortfolioManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRCustomerCampaignPortfolioManagementPlanRequestOutputModel.json",new TypeReference<CRCustomerCampaignPortfolioManagementPlanRequestOutputModel>(){});
	}
	
	public CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModel.json",new TypeReference<CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCampaignDirectionRetrieveOutputModel retrieveCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCampaignDirectionRetrieveOutputModel.json",new TypeReference<BQCampaignDirectionRetrieveOutputModel>(){});
	}
	
	public BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMarketTrackingRetrieveOutputModel.json",new TypeReference<BQMarketTrackingRetrieveOutputModel>(){});
	}
	
	public BQPerformanceAssessmentRetrieveOutputModel retrievePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceAssessmentRetrieveOutputModel.json",new TypeReference<BQPerformanceAssessmentRetrieveOutputModel>(){});
	}
	
	public SDCustomerCampaignManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerCampaignManagementRetrieveOutputModel.json",new TypeReference<SDCustomerCampaignManagementRetrieveOutputModel>(){});
	}
	
	public CRCustomerCampaignPortfolioManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCampaignPortfolioManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRCustomerCampaignPortfolioManagementPlanUpdateOutputModel.json",new TypeReference<CRCustomerCampaignPortfolioManagementPlanUpdateOutputModel>(){});
	}
	
	public BQCampaignDirectionUpdateOutputModel updateCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionUpdateInputModel request){
		return JsonReader.read("update-BQCampaignDirectionUpdateOutputModel.json",new TypeReference<BQCampaignDirectionUpdateOutputModel>(){});
	}
	
	public BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request){
		return JsonReader.read("update-BQMarketTrackingUpdateOutputModel.json",new TypeReference<BQMarketTrackingUpdateOutputModel>(){});
	}
	
	public BQPerformanceAssessmentUpdateOutputModel updatePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceAssessmentUpdateOutputModel.json",new TypeReference<BQPerformanceAssessmentUpdateOutputModel>(){});
	}
	
}
