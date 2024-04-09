
Feature: DeshEcart login vallidation 

Background: 
    Given User open the browser
    And Go to url "http://www.deshecart.com"
   @TC0002
  Scenario: Login to deshEcart with valid credentials 
    Then Click on the sign-in button 
    Then insert valid uid and password 
    And click on submit button  
    Then quit the browser
    
    @Nahid
   Scenario: Login to deshEcart with invalid credentials 
    Then Click on the sign-in button 
    Then insert valid uid and password 
    And select the remember me box 
    Then quit the browser
    
    
    
    
    
    
    
 