package org.web3j.example.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */
public class HealthChain extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060405161030d38038061030d83398101604052805160008054600160a060020a0319163317905501805161004c906003906020840190610053565b50506100ee565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061009457805160ff19168380011785556100c1565b828001600101855582156100c1579182015b828111156100c15782518255916020019190600101906100a6565b506100cd9291506100d1565b5090565b6100eb91905b808211156100cd57600081556001016100d7565b90565b610210806100fd6000396000f30060806040526004361061006c5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416633d00830f81146100715780633e3282181461009857806394b662f1146100b2578063aea90cb8146100e9578063c8f8af9c146100fe575b600080fd5b34801561007d57600080fd5b50610086610113565b60408051918252519081900360200190f35b3480156100a457600080fd5b506100b0600435610119565b005b3480156100be57600080fd5b506100b073ffffffffffffffffffffffffffffffffffffffff6004358116906024351660443561015a565b3480156100f557600080fd5b506100b06101b3565b34801561010a57600080fd5b506100866101de565b60055490565b60015473ffffffffffffffffffffffffffffffffffffffff16331461013d57600080fd5b60045481111561014c57600080fd5b600480548290039055600555565b6000805473ffffffffffffffffffffffffffffffffffffffff1990811633179091556002805473ffffffffffffffffffffffffffffffffffffffff94851690831617905560018054949093169316929092179055600455565b60025473ffffffffffffffffffffffffffffffffffffffff1633146101d757600080fd5b6000600555565b600454905600a165627a7a72305820ab607d7c65a6445606d844e37462a1a09c72ef3feab7c1601b592ec4ebd39d0c0029";

    public static final String FUNC_COUNT_SELLER = "Count_seller";

    public static final String FUNC_BUY = "Buy";

    public static final String FUNC_ADDPATIENT = "AddPatient";

    public static final String FUNC_SELL = "Sell";

    public static final String FUNC_COUNT_PATIENT = "Count_patient";

    @Deprecated
    protected HealthChain(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected HealthChain(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected HealthChain(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected HealthChain(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> Count_seller() {
        final Function function = new Function(FUNC_COUNT_SELLER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> Buy(BigInteger _count) {
        final Function function = new Function(
                FUNC_BUY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_count)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> AddPatient(String _patient, String _seller, BigInteger _count) {
        final Function function = new Function(
                FUNC_ADDPATIENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_patient), 
                new org.web3j.abi.datatypes.Address(_seller), 
                new org.web3j.abi.datatypes.generated.Uint256(_count)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> Sell() {
        final Function function = new Function(
                FUNC_SELL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> Count_patient() {
        final Function function = new Function(FUNC_COUNT_PATIENT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<HealthChain> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _name_type) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name_type)));
        return deployRemoteCall(HealthChain.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<HealthChain> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _name_type) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name_type)));
        return deployRemoteCall(HealthChain.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<HealthChain> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _name_type) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name_type)));
        return deployRemoteCall(HealthChain.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<HealthChain> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _name_type) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name_type)));
        return deployRemoteCall(HealthChain.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static HealthChain load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new HealthChain(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static HealthChain load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HealthChain(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static HealthChain load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new HealthChain(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static HealthChain load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new HealthChain(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
