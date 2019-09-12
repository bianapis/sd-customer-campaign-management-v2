package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolioCustomerCampaignMetrics
 */
public class CRCustomerCampaignPortfolioManagementPlanUpdateInputModelCustomerCampaignPortfolioCustomerCampaignMetrics   {
  private String customerCampaignMetricDefinition = null;

  private String customerCampaignMetricGoal = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the metric, defining how it is to be measured in deployment 
   * @return customerCampaignMetricDefinition
  **/

  public String getCustomerCampaignMetricDefinition() {
    return customerCampaignMetricDefinition;
  }

  public void setCustomerCampaignMetricDefinition(String customerCampaignMetricDefinition) {
    this.customerCampaignMetricDefinition = customerCampaignMetricDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the target performance for the metric that can be defined for different usage scenarios as appropriate 
   * @return customerCampaignMetricGoal
  **/

  public String getCustomerCampaignMetricGoal() {
    return customerCampaignMetricGoal;
  }

  public void setCustomerCampaignMetricGoal(String customerCampaignMetricGoal) {
    this.customerCampaignMetricGoal = customerCampaignMetricGoal;
  }


}

