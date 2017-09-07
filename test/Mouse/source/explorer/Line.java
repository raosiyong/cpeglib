//=========================================================================
//
//  Part of PEG parser generator Mouse.
//
//  Copyright (C) 2017 by Roman R. Redziejowski (www.romanredz.se).
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//
//-------------------------------------------------------------------------
//
//  Change log
//    170301 Created.
//
//=========================================================================

package mouse.explorer;


//HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
//
//  Line
//
//-------------------------------------------------------------------------
//
//  Abstract base class for different kinds of lines.
//  Line is made non-selectable by letting 'find' return null.
//
//HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

abstract class Line
{
  int start = -1;  // Starting offset in 'area' of GUI
  int end = -1;    // Ending offset in 'area' of GUI

  //-------------------------------------------------------------------
  //  Append text represented by this Line to StringBuffer 'sb'.
  //-------------------------------------------------------------------
  abstract void writeTo(StringBuffer sb);

  //-------------------------------------------------------------------
  //  Return information about this Line or a contained object
  //  selected by clicking mouse at offset 'offs' in display area.
  //-------------------------------------------------------------------
  abstract Element find(int offset);
}

