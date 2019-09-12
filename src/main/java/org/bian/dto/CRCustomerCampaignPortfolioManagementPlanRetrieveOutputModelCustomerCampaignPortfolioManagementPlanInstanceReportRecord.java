package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord
 */
public class CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord   {
  private String customerCampaignPortfolioManagementPlanInstanceReportData = null;

  private String customerCampaignPortfolioManagementPlanInstanceReportType = null;

  private Object customerCampaignPortfolioManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCampaignPortfolioManagementPlanInstanceReportData
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReportData() {
    return customerCampaignPortfolioManagementPlanInstanceReportData;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReportData(String customerCampaignPortfolioManagementPlanInstanceReportData) {
    this.customerCampaignPortfolioManagementPlanInstanceReportData = customerCampaignPortfolioManagementPlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCampaignPortfolioManagementPlanInstanceReportType
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReportType() {
    return customerCampaignPortfolioManagementPlanInstanceReportType;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReportType(String customerCampaignPortfolioManagementPlanInstanceReportType) {
    this.customerCampaignPortfolioManagementPlanInstanceReportType = customerCampaignPortfolioManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCampaignPortfolioManagementPlanInstanceReport
  **/

  public Object getCustomerCampaignPortfolioManagementPlanInstanceReport() {
    return customerCampaignPortfolioManagementPlanInstanceReport;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReport(Object customerCampaignPortfolioManagementPlanInstanceReport) {
    this.customerCampaignPortfolioManagementPlanInstanceReport = customerCampaignPortfolioManagementPlanInstanceReport;
  }


}

