package org.rajorgunit.rajsample.rajsampleproj;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Address implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer number;
   private java.lang.String streetName;
   private java.lang.String city;
   private java.lang.Integer zip;

   public Address()
   {
   }

   public java.lang.Integer getNumber()
   {
      return this.number;
   }

   public void setNumber(java.lang.Integer number)
   {
      this.number = number;
   }

   public java.lang.String getStreetName()
   {
      return this.streetName;
   }

   public void setStreetName(java.lang.String streetName)
   {
      this.streetName = streetName;
   }

   public java.lang.String getCity()
   {
      return this.city;
   }

   public void setCity(java.lang.String city)
   {
      this.city = city;
   }

   public java.lang.Integer getZip()
   {
      return this.zip;
   }

   public void setZip(java.lang.Integer zip)
   {
      this.zip = zip;
   }

   public Address(java.lang.Integer number, java.lang.String streetName,
         java.lang.String city, java.lang.Integer zip)
   {
      this.number = number;
      this.streetName = streetName;
      this.city = city;
      this.zip = zip;
   }

}