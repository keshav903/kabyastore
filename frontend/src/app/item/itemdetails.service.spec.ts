import { TestBed } from '@angular/core/testing';

import { ItemdetailsService } from './itemdetails.service';

describe('ItemdetailsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ItemdetailsService = TestBed.get(ItemdetailsService);
    expect(service).toBeTruthy();
  });
});
