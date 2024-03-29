package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceReport
 */
public class BQCampaignDirectionRetrieveOutputModelCampaignDirectionInstanceReport   {
  private Object campaignDirectionInstanceReportRecord = null;

  private String campaignDirectionInstanceReportType = null;

  private String campaignDirectionInstanceReportParameters = null;

  private Object campaignDirectionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return campaignDirectionInstanceReportRecord
  **/

  public Object getCampaignDirectionInstanceReportRecord() {
    return campaignDirectionInstanceReportRecord;
  }

  public void setCampaignDirectionInstanceReportRecord(Object campaignDirectionInstanceReportRecord) {
    this.campaignDirectionInstanceReportRecord = campaignDirectionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return campaignDirectionInstanceReportType
  **/

  public String getCampaignDirectionInstanceReportType() {
    return campaignDirectionInstanceReportType;
  }

  public void setCampaignDirectionInstanceReportType(String campaignDirectionInstanceReportType) {
    this.campaignDirectionInstanceReportType = campaignDirectionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return campaignDirectionInstanceReportParameters
  **/

  public String getCampaignDirectionInstanceReportParameters() {
    return campaignDirectionInstanceReportParameters;
  }

  public void setCampaignDirectionInstanceReportParameters(String campaignDirectionInstanceReportParameters) {
    this.campaignDirectionInstanceReportParameters = campaignDirectionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return campaignDirectionInstanceReport
  **/

  public Object getCampaignDirectionInstanceReport() {
    return campaignDirectionInstanceReport;
  }

  public void setCampaignDirectionInstanceReport(Object campaignDirectionInstanceReport) {
    this.campaignDirectionInstanceReport = campaignDirectionInstanceReport;
  }


}

