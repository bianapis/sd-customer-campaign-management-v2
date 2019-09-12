package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolioCustomerCampaignMetrics;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolioCustomerCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolio
 */
public class CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolio   {
  private String customerCampaignType = null;

  private String customerCampaignDescription = null;

  private CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolioCustomerCampaignMetrics customerCampaignMetrics = null;

  private CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolioCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of customer campaign (e.g. cross-sell, up-sell, retention) 
   * @return customerCampaignType
  **/

  public String getCustomerCampaignType() {
    return customerCampaignType;
  }

  public void setCustomerCampaignType(String customerCampaignType) {
    this.customerCampaignType = customerCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact 
   * @return customerCampaignDescription
  **/

  public String getCustomerCampaignDescription() {
    return customerCampaignDescription;
  }

  public void setCustomerCampaignDescription(String customerCampaignDescription) {
    this.customerCampaignDescription = customerCampaignDescription;
  }


  /**
   * Get customerCampaignMetrics
   * @return customerCampaignMetrics
  **/

  public CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolioCustomerCampaignMetrics getCustomerCampaignMetrics() {
    return customerCampaignMetrics;
  }

  public void setCustomerCampaignMetrics(CRCustomerCampaignPortfolioManagementPlanCreateInputModelCustomerCampaignPortfolioCustomerCampaignMetrics customerCampaignMetrics) {
    this.customerCampaignMetrics = customerCampaignMetrics;
  }


  /**
   * Get customerCampaignPerformanceRecord
   * @return customerCampaignPerformanceRecord
  **/

  public CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolioCustomerCampaignPerformanceRecord getCustomerCampaignPerformanceRecord() {
    return customerCampaignPerformanceRecord;
  }

  public void setCustomerCampaignPerformanceRecord(CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolioCustomerCampaignPerformanceRecord customerCampaignPerformanceRecord) {
    this.customerCampaignPerformanceRecord = customerCampaignPerformanceRecord;
  }


}

