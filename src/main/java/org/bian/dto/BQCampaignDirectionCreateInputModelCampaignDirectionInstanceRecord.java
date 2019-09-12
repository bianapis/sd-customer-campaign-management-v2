package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord
 */
public class BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord   {
  private String customerCampaignDevelopmentSchedule = null;

  private String customerCampaignExecutionSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule of planned and actual customer campaign design development and refinement activity 
   * @return customerCampaignDevelopmentSchedule
  **/

  public String getCustomerCampaignDevelopmentSchedule() {
    return customerCampaignDevelopmentSchedule;
  }

  public void setCustomerCampaignDevelopmentSchedule(String customerCampaignDevelopmentSchedule) {
    this.customerCampaignDevelopmentSchedule = customerCampaignDevelopmentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule of planned and actual customer campaign execution activities 
   * @return customerCampaignExecutionSchedule
  **/

  public String getCustomerCampaignExecutionSchedule() {
    return customerCampaignExecutionSchedule;
  }

  public void setCustomerCampaignExecutionSchedule(String customerCampaignExecutionSchedule) {
    this.customerCampaignExecutionSchedule = customerCampaignExecutionSchedule;
  }


}

