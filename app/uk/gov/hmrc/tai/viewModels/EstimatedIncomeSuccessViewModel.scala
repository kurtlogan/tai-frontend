/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.tai.viewModels

import play.api.i18n.Messages

trait EstimatedIncomeSuccessViewModel {
  def employerName: String
  def employerId: Int
  def heading(implicit messages: Messages): String = { messages("tai.incomes.updated.check.title", employerName) }
  def paragraph1(implicit messages: Messages): String
  def paragraph2(implicit messages: Messages): String
  def link(implicit messages: Messages): String
}

case class EstimatedPensionIncomeSuccessViewModel(employerName: String, employerId: Int) extends EstimatedIncomeSuccessViewModel {

  def paragraph1(implicit messages: Messages): String = {
    messages("tai.incomes.updated.pension.check.text")
  }

  def paragraph2(implicit messages: Messages): String = {
    messages("tai.incomes.updated.pension.seeChanges.text", employerName)
  }

  def link(implicit messages: Messages): String = {
    messages("tai.incomes.updated.pension.check.link")
  }
}

case class EstimatedEmploymentIncomeSuccessViewModel(employerName: String, employerId: Int) extends EstimatedIncomeSuccessViewModel {

  def paragraph1(implicit messages: Messages): String = {
    messages("tai.incomes.updated.check.text")
  }

  def paragraph2(implicit messages: Messages): String = {
    messages("tai.incomes.seeChanges.text", employerName)
  }

  def link(implicit messages: Messages): String = {
    messages("tai.incomes.updated.check.link")
  }
}
