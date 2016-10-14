/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.github.calebrw.fizzbuzz;

import java.io.IOException;

/**
 * The Main class of the FizzBuzz application
 *
 * Created by Caleb on 10/13/2016.
 */
public class Main {

    public static void main(String [] args) {

        try {
            FizzBuzz fizzBuzz = new FizzBuzz(100);
            System.out.println(fizzBuzz.generate());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
