/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author tram nguyen
 */
public class Queries {
    
    public static String updateProductVolumn = "UPDATE product SET volumn = ? WHERE id = ?";
    public static String selectUser = "SELECT * FROM user";
    public static String getAllProduct = "SELECT * FROM product";
    public static String getAllCarts = "SELECT * FROM cart WHERE user_id = ?";
    public static String getCart = "SELECT * FROM cart WHERE user_id = ? AND product_id = ?";
    public static String updateProductCartVolumn = "UPDATE cart SET volumn = ?, price = ? WHERE user_id = ? AND product_id = ? ";
    public static String createCart = "INSERT INTO cart VALUES (?,?,?,?,?)";    
    public static String deleteCart = "DELETE FROM cart WHERE user_id = ? AND product_id = ?";
}
