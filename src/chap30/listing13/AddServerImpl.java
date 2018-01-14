package chap30.listing13;

import java.rmi.*;
import java.rmi.server.*;

import chap30.listing12.AddServerIntf;
public class AddServerImpl extends UnicastRemoteObject
  implements AddServerIntf {

  public AddServerImpl() throws RemoteException {
  }
  public double add(double d1, double d2) throws RemoteException {
    return d1 + d2;
  }
}
