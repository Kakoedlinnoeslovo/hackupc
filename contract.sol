pragma solidity ^0.4.0;
contract HealthChain {
    
    address owner;
    
    address patient;
    address seller;
    
    string name_type;
    
    uint256 count;
    uint256 count_sell;
    
    
    function HealthChain (string _name_type) public {
        owner = msg.sender;
        name_type = _name_type;  
    }    
    
    function AddPatient (address _patient, address _seller, uint256 _count) public {
        owner = msg.sender;
        seller = _seller;
        patient = _patient;
        count = _count;
    }    
    
    function Buy (uint256 _count) public {
        require (patient == msg.sender);
        require (count>=_count);
        
        count = count - _count;
        count_sell = _count;
    }    
    
    function Sell () public {
        require (seller == msg.sender);
        
        count_sell = 0;
    }    
   
    function Count_patient() public view returns (uint256) {
        return count;
    }
    
    function Count_seller() public view returns (uint256) {
        return count_sell;
    }

}
