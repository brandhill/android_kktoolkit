/* Copyright (C) 2013 KKBOX Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * ​http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kkbox.toolkit.dialog;


public class KKDialogFactory {

	public static KKDialog createAlertDialog(int notificationId, String title, String message, String positiveButtonText,
			KKDialogPostExecutionListener listener) {
		KKDialog dialog = new KKDialog();
		dialog.setContent(notificationId, title, message, positiveButtonText, "", "", KKDialog.Type.ALERT_DIALOG, listener);
		return dialog;
	}

	public static KKDialog createYesOrNoDialog(int notificationId, String title, String message, String positiveButtonText, String negativeButtonText,
			KKDialogPostExecutionListener listener) {
		KKDialog dialog = new KKDialog();
		dialog.setContent(notificationId, title, message, positiveButtonText, negativeButtonText, "", KKDialog.Type.YES_OR_NO_DIALOG,
				listener);
		return dialog;
	}

	public static KKDialog createThreeChoiceDialog(int notificationId, String title, String message, String positiveButtonText, String neutralButtonText,
			String negativeButtonText, KKDialogPostExecutionListener listener) {
		KKDialog dialog = new KKDialog();
		dialog.setContent(notificationId, title, message, positiveButtonText, negativeButtonText, neutralButtonText,
				KKDialog.Type.THREE_CHOICE_DIALOG, listener);
		return dialog;
	}

	public static KKDialog createProgressingDialog(int notificationId, String message, KKDialogPostExecutionListener listener) {
		KKDialog dialog = new KKDialog();
		dialog.setContent(notificationId, "", message, "", "", "", KKDialog.Type.PROGRESSING_DIALOG, listener);
		return dialog;
	}
}