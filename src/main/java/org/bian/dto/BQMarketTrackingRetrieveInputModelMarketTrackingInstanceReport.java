package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRetrieveInputModelMarketTrackingInstanceReport
 */
public class BQMarketTrackingRetrieveInputModelMarketTrackingInstanceReport   {
  private String marketTrackingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return marketTrackingInstanceReportReference
  **/

  public String getMarketTrackingInstanceReportReference() {
    return marketTrackingInstanceReportReference;
  }

  public void setMarketTrackingInstanceReportReference(String marketTrackingInstanceReportReference) {
    this.marketTrackingInstanceReportReference = marketTrackingInstanceReportReference;
  }


}

