package org.rajorgunit.rajsample.rajsampleproj;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String firstName;
   private java.lang.String lastName;
   private org.rajorgunit.rajsample.rajsampleproj.Address address;

   public Customer()
   {
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public org.rajorgunit.rajsample.rajsampleproj.address getAddress()
   {
      return this.address;
   }

   public void setAddress(org.rajorgunit.rajsample.rajsampleproj.address address)
   {
      this.address = address;
   }

   public Customer(java.lang.String firstName, java.lang.String lastName,
         org.rajorgunit.rajsample.rajsampleproj.Address address)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
   }

}