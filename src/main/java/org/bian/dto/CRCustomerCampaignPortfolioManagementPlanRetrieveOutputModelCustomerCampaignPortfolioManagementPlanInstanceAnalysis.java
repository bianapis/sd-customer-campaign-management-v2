package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis
 */
public class CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis   {
  private String customerCampaignPortfolioManagementPlanInstanceAnalysisData = null;

  private String customerCampaignPortfolioManagementPlanInstanceAnalysisReportType = null;

  private Object customerCampaignPortfolioManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysisData
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceAnalysisData() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysisData;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysisData(String customerCampaignPortfolioManagementPlanInstanceAnalysisData) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysisData = customerCampaignPortfolioManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysisReportType
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceAnalysisReportType() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysisReportType;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysisReportType(String customerCampaignPortfolioManagementPlanInstanceAnalysisReportType) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysisReportType = customerCampaignPortfolioManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysisReport
  **/

  public Object getCustomerCampaignPortfolioManagementPlanInstanceAnalysisReport() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysisReport;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysisReport(Object customerCampaignPortfolioManagementPlanInstanceAnalysisReport) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysisReport = customerCampaignPortfolioManagementPlanInstanceAnalysisReport;
  }


}

